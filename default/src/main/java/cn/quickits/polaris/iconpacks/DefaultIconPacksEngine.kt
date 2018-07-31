package cn.quickits.polaris.iconpacks

import android.net.Uri
import cn.quickits.polaris.iconpacks.core.IconPacksEngine

class DefaultIconPacksEngine : IconPacksEngine {

    override fun getFolderIcon(): Uri =
            Uri.parse("file:///android_asset/file_extension_icons/file_extension_folder.png")

    override fun getFileExtensionIcon(extension: String?): Uri =
            Uri.parse("file:///android_asset/file_extension_icons/file_extension_${extension?.toLowerCase()}.png")

}