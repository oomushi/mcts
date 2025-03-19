package io.github.oomushi.mcts.examples;

import io.github.oomushi.mcts.MctsDomainState;

import java.util.List;

public class StaticState implements MctsDomainState<String, TicTacToePlayer> {

    private List<String> availableActions;

    public StaticState(List<String> availableActions) {
        this.availableActions = availableActions;
    }

    @Override
    public boolean isTerminal() {
        return false;
    }

    @Override
    public TicTacToePlayer getCurrentAgent() {
        return null;
    }

    @Override
    public TicTacToePlayer getPreviousAgent() {
        return null;
    }

    @Override
    public int getNumberOfAvailableActionsForCurrentAgent() {
        return getAvailableActionsForCurrentAgent().size();
    }

    @Override
    public List<String> getAvailableActionsForCurrentAgent() {
        return availableActions;
    }

    @Override
    public MctsDomainState performActionForCurrentAgent(String action) {
        return this;
    }

    @Override
    public MctsDomainState skipCurrentAgent() {
        return this;
    }
}