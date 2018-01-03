<%@include file="/WEB-INF/views/template/header.jsp" %>
<div class="container">
    <br/>
    <h1>Contact Form</h1>
    <p>If you have any questions fill form</p>
    <br/>
    <div class="message">
        <form group="form-group" method="post" action="sendEmail.do" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>Subject:</td>
                    <td><input type="text" name="subject" size="45" /></td>
                </tr>
                <tr>
                    <td>Your mail ID:</td>
                    <td><input type="text" name="yourmail" size="45" /></td>
                </tr>
                <tr>
                    <td>Message:</td>
                    <td><textarea cols="50" rows="10" name="message"></textarea></td>
                </tr>
                <tr>
                    <td>Attach file:</td>
                    <td><input type="file" name="attachFile" size="60" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="Send E-mail"  class="btn btn-primary"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
    <br/>
</div>

<%@include file="/WEB-INF/views/template/footer.jsp" %>