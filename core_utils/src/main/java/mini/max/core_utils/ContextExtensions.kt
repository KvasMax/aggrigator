package mini.max.core_utils

import android.content.Context
import android.content.pm.ApplicationInfo

fun Context.isDebug() = (this.applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE) != 0