package app.aaps.core.nssdk.localmodel.treatment

import app.aaps.core.nssdk.localmodel.entry.NsUnits

data class NSRemoteBolus(
    override var date: Long?,
    override val device: String? = null,
    override val identifier: String?,
    override val units: NsUnits? = null,
    override val srvModified: Long? = null,
    override val srvCreated: Long? = null,
    override var utcOffset: Long?,
    override val subject: String? = null,
    override var isReadOnly: Boolean = false,
    override val isValid: Boolean,
    override val eventType: EventType,
    override val notes: String?,
    override val pumpId: Long?,
    override val endId: Long?,
    override val pumpType: String?,
    override val pumpSerial: String?,
    override var app: String? = null,
    override val _insulin: Double,
    override val _remoteEventType: RemoteEventType? = null,
    override val _phoneNumber: String? = null,
    val type: BolusType,
    val isBasalInsulin: Boolean

) : NSTreatment {

    enum class BolusType {
        NORMAL,
        SMB,
        PRIMING;

        companion object {

            fun fromString(name: String?) = entries.firstOrNull { it.name == name } ?: NORMAL
        }
    }
}
