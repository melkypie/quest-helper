/*
 * Copyright (c) 2020, Zoinkwiz <https://github.com/Zoinkwiz>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.questhelper.panel;

import java.util.ArrayList;
import java.util.Arrays;
import lombok.Getter;
import com.questhelper.ItemRequirement;
import com.questhelper.steps.QuestStep;
import lombok.Setter;

public class PanelDetails {
	@Getter
	String header;

	@Getter
	private ArrayList<QuestStep> steps;

	@Getter
	private QuestStep lockingQuestSteps;

	@Getter
	private ArrayList<ItemRequirement> itemRequirements;

	@Getter
	private ArrayList<Integer> vars;

	public PanelDetails(String header) {
		this.header = header;
		this.steps = new ArrayList<>();
	}

	public PanelDetails(String header, QuestStep... steps) {
		this.header = header;
		this.steps = new ArrayList<>(Arrays.asList(steps));
		this.itemRequirements = new ArrayList<>();
	}

	public PanelDetails(String header, ArrayList<QuestStep> steps, ItemRequirement... itemRequirements) {
		this.header = header;
		this.steps = steps;
		this.itemRequirements = new ArrayList<>(Arrays.asList(itemRequirements));
	}

	public void setVars(Integer... vars)
	{
		this.vars = new ArrayList<>(Arrays.asList(vars));
	}

	public void setLockingStep(QuestStep lockingStep)
	{
		this.lockingQuestSteps = lockingStep;
	}

	public void addSteps(QuestStep... steps) {
		this.steps.addAll(Arrays.asList(steps));
	}
}