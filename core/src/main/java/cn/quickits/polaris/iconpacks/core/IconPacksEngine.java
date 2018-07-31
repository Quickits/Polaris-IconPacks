package cn.quickits.polaris.iconpacks.core;

import android.net.Uri;

public interface IconPacksEngine {

    Uri getFolderIcon();

    Uri getFileExtensionIcon(String extension);

}
