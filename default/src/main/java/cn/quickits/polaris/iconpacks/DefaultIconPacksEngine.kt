package cn.quickits.polaris.iconpacks

import cn.quickits.polaris.iconpacks.core.IconPacksEngine

class DefaultIconPacksEngine : IconPacksEngine {

    override fun getFolderIcon(): String =
            "file:///android_asset/file_extension_icons/file_extension_folder.png"

    override fun getFileExtensionIcon(extension: String?): String =
            "file:///android_asset/file_extension_icons/file_extension_${extension?.toLowerCase()}.png"
}