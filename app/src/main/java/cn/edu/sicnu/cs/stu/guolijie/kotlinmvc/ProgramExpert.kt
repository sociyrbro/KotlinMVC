package cn.edu.sicnu.cs.stu.guolijie.kotlinmvc

import androidx.annotation.StringRes

class ProgramExpert {
    @StringRes
    fun getLanguage(featureIndex: Int): Int {
        return when (featureIndex) {
            0 -> R.string.lang_c
            1 -> R.string.lang_python
            2 -> R.string.lang_kotlin
            3 -> R.string.lang_java
            else -> R.string.lang_unknown
        }
    }
}
