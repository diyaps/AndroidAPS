package app.aaps.plugins.sync.nsclientV3.services.NSHelper

import android.content.Context
import okhttp3.logging.HttpLoggingInterceptor

class NSHelper {
    enum class TreatmentStatus {
        PENDING,
        APPLIED,
        CANCELED
    }
}