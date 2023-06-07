package cz.csas.my.model.participants;

import cz.csas.my.model.Battlefield;

public abstract class BattleParticipant {
    private ParticipantType participantType;
    private Battlefield ownBattlefield;
    private Battlefield rivalBattlefield;

    public BattleParticipant(ParticipantType participantType, Battlefield ownBattlefield, Battlefield rivalBattlefield) {
        this.participantType = participantType;
        this.ownBattlefield = ownBattlefield;
        this.rivalBattlefield = rivalBattlefield;
    }

    public ParticipantType getPlayerType() {
        return participantType;
    }

    public void setPlayerType(ParticipantType participantType) {
        this.participantType = participantType;
    }

    public Battlefield getOwnBattlefield() {
        return ownBattlefield;
    }

    public void setOwnBattlefield(Battlefield ownBattlefield) {
        this.ownBattlefield = ownBattlefield;
    }

    public Battlefield getRivalBattlefield() {
        return rivalBattlefield;
    }

    public void setRivalBattlefield(Battlefield rivalBattlefield) {
        this.rivalBattlefield = rivalBattlefield;
    }
}
