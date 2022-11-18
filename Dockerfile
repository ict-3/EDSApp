FROM ivonet/payara:5.193.1
COPY ./artifact/EDSApp.war $DEPLOY_DIR
