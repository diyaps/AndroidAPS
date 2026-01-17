package app.aaps.pump.omnipod.common.ui.wizard.deactivation

import android.os.Bundle
import androidx.annotation.IdRes
import app.aaps.pump.omnipod.common.R
import app.aaps.pump.omnipod.common.ui.wizard.common.activity.OmnipodWizardActivityBase

abstract class PodDeactivationWizardActivity : OmnipodWizardActivityBase() {

    @IdRes
    private var startDestination: Int = R.id.startPodDeactivationFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.omnipod_common_pod_deactivation_wizard_activity)

        title = getString(R.string.omnipod_common_pod_management_button_deactivate_pod)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val navController = getNavController()
        val navInflater = navController.navInflater
        val graph = navInflater.inflate(R.navigation.omnipod_common_pod_deactivation_wizard_navigation_graph)
        graph.setStartDestination(startDestination)
        navController.graph = graph
    }

    override fun getTotalDefinedNumberOfSteps(): Int = 3

    override fun getActualNumberOfSteps(): Int = 3

}