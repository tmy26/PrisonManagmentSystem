public class Search {


}


/*class SearchSpravkaAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        conn = DBConnection.getConnection();

        String sql = "SELECT FNAME, LNAME, SEX, AGE, REASON\n" +
                "FROM PRISONER P\n" +
                "JOIN PERSON P ON R.PERSON_ID = P.ID\n" +
                "JOIN CAR C ON R.CAR_ID = C.ID\n" +
                "WHERE P.FNAME = ? AND C.PRICE <= ?";
        try {
            state = conn.prepareStatement(sql);
            state.setString(1,fnameSprTF.getText());
            state.setDouble( 2 ,Double.parseDouble(priceCarSprTF.getText()));
            result = state.executeQuery();
            tableSpravka.setModel(new MyModel(result));
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }
}
*/