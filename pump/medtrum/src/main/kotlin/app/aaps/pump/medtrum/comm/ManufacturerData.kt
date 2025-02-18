package app.aaps.pump.medtrum.comm

import android.util.Log
import app.aaps.core.interfaces.logging.AAPSLogger
import app.aaps.core.interfaces.logging.LTag
import app.aaps.pump.medtrum.extension.toLong
import javax.inject.Inject
import kotlin.experimental.and

class ManufacturerData(manufacturerDataBytes: ByteArray) {
    private var deviceID: Long = 0
    private var deviceType = 0
    private var version = 0

    init {
        setData(manufacturerDataBytes)
    }

    private fun setData(inputData: ByteArray) {
        var index = 0
        val deviceIDBytes: ByteArray = inputData.copyOfRange(index, index + 4)
        deviceID = deviceIDBytes.toLong()
        Log.d("PUMP", "LJW get SN from manufacture data: " + deviceIDBytes.contentToString().format("%02X"))
        index += 4
        deviceType = (inputData[index] and 0xff.toByte()).toInt()
        index += 1
        version = (inputData[index] and 0xff.toByte()).toInt()
    }

    fun getDeviceSN(): Long {
        return deviceID
    }

    fun getDeviceType(): Int {
        return deviceType
    }

    fun getVersion(): Int {
        return version
    }
}
