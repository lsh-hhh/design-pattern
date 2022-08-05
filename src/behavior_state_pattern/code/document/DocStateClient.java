package behavior_state_pattern.code.document;

import behavior_state_pattern.code.document.doc.Admin;
import behavior_state_pattern.code.document.doc.Doc;
import behavior_state_pattern.code.document.doc.OrdinaryUser;
import behavior_state_pattern.code.document.doc.Role;
import behavior_state_pattern.code.document.state.PublishedState;

public class DocStateClient {

    public static void main(String[] args) {

        Doc doc = new Doc();
        OrdinaryUser amao = new OrdinaryUser("amao", Role.ORDINARY_USER);

        doc.setAuthor(amao);
        System.out.println(doc);

        amao.submit(doc);
        System.out.println(doc);

        Admin admin = new Admin("admin", Role.ADMIN);
        admin.setDoc(doc);
        admin.audit(new PublishedState(doc));
        System.out.println(doc);

    }
}
