FROM airhacks/glassfish
COPY ./target/ScoopesJakartaEE8.war ${DEPLOYMENT_DIR}
