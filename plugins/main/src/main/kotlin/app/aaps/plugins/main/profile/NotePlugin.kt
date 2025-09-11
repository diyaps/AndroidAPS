package app.aaps.plugins.main.profile

import app.aaps.core.data.plugin.PluginType
import app.aaps.core.interfaces.logging.AAPSLogger
import app.aaps.core.interfaces.plugin.PluginBase
import app.aaps.core.interfaces.plugin.PluginDescription
import app.aaps.core.interfaces.resources.ResourceHelper
import app.aaps.plugins.main.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NotePlugin @Inject constructor(
    aapsLogger: AAPSLogger,
    rh: ResourceHelper
) : PluginBase(
    PluginDescription()
        .mainType(PluginType.GENERAL)
        .fragmentClass(NoteFragment::class.java.name)
        .alwaysVisible(true)
        .enableByDefault(true)
        .visibleByDefault(true)
        .showInList { true }
        .simpleModePosition(PluginDescription.Position.TAB)
        .pluginIcon(app.aaps.core.objects.R.drawable.ic_access_alarm_24dp)
        .pluginName(R.string.note_title)
        .shortName(R.string.note_short)
        .description(R.string.note_description)
        .setDefault(),
    aapsLogger, rh
) {

    override fun onStart() {
        super.onStart()
        aapsLogger.debug("NotePlugin started")
    }
}
