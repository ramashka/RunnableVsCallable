package edu.rdragunov.executor.data;

import edu.rdragunov.executor.npc.Executor;
import edu.rdragunov.executor.npc.User;

/**
 * Created by Rrr on 05.06.2016.
 */
public class TourtureResult {
    String secretInformation;
    User user;
    Executor executor;
    Long TourturedTime;

    public TourtureResult(User user, Executor executor) {
        this.user = user;
        this.executor = executor;
    }

    public Long getTourturedTime() {
        return TourturedTime;
    }

    public void setTourturedTime(Long tourturedTime) {
        TourturedTime = tourturedTime;
    }

    public String getSecretInformation() {
        return secretInformation;
    }

    public void setSecretInformation(String secretInformation) {
        this.secretInformation = secretInformation;
    }

    @Override
    public String toString() {
        return "TourtureResult{" +
                "\n\tпалач " + executor.getName() +
                "\n\tс помощью '" + TortureGenerator.generateTourture() +
                "'\n\tвырвал из жителя по имени " + user.getName() +
                "\n\tсекретную информаци про '" + secretInformation +
                "'\n\t за " + TourturedTime + "ms" +
                '}';
    }
}
