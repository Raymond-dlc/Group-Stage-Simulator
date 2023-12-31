package com.oceanscurse.groupstagesimulator.ui.simulator

import com.oceanscurse.groupstagesimulator.model.GroupStage

/**
 * Created by Raymond de la Croix on 16-12-2023.
 */
data class SimulatorUiState(
    /**
     * Whether or not the simulator has all the requirements set up to run.
     * In this case that means if there are at least the number of teams created
     * as defined in Constants.NUM_COMPETING_TEAMS.
     */
    val meetsRequirements: Boolean = false,
    /**
     * The groupStage containing the data from the simulation.
     */
    val groupStage: GroupStage? = null
)
