# PubSubModel

## Overview:

PubSubModel is a distributed event-based pub-sub system allowing publishers to broadcast messages to subscribers based on topics. It facilitates real-time communication between components in a distributed system.

## Setup:

1. Clone the repository.
2. Build the project using Maven or your preferred build tool.
3. Ensure Java is installed on your system.

## Usage:

1. Start PubSubServer instances:
    ```
    java -cp <path_to_jar_file> edu.scu.distributed.server.PubSubServerImpl <config_file_path> <port_number> <topics_root_folder_path>
    ```

2. Start UserClient instances:
    - For Publisher:
        ```
        java -cp <path_to_jar_file> edu.scu.distributed.client.UserClient publisher <local_address> <local_port> <server_address> <server_port>
        ```
        Publish messages using the format: `send <server_address> <server_port> <topic> <message>`
        
    - For Subscriber:
        ```
        java -cp <path_to_jar_file> edu.scu.distributed.client.UserClient subscriber <local_address> <local_port> <server_address> <server_port>
        ```
        Subscribe to topics using the format: `subscribe <server_address> <server_port> <topic>`

## Example:

1. Starting PubSubServer instances:
    ```
    java -cp /path/to/pub-sub-project-1.0-SNAPSHOT.jar edu.scu.distributed.server.PubSubServerImpl config/test.yaml 6000 /path/to/TopicsRootFolder
    ```
    ```
    java -cp /path/to/pub-sub-project-1.0-SNAPSHOT.jar edu.scu.distributed.server.PubSubServerImpl config/test.yaml 6005 /path/to/TopicsRootFolder
    ```
    ```
    java -cp /path/to/pub-sub-project-1.0-SNAPSHOT.jar edu.scu.distributed.server.PubSubServerImpl config/test.yaml 6010 /path/to/TopicsRootFolder
    ```

2. Starting UserClient instances:
    - Publisher:
        ```
        java -cp /path/to/pub-sub-project-1.0-SNAPSHOT.jar edu.scu.distributed.client.UserClient publisher 192.168.1.114 8090 192.168.1.114 6000
        ```
        Publish messages:
        ```
        send 192.168.1.114 6000 /sports_event Warriors vs Lakers at Chase Center on May 10th, 7:00 PM
        send 192.168.1.114 6000 /art_event Exhibition opening at SFMOMA on May 15th, 6:00 PM
        send 192.168.1.114 6000 /dance_event Salsa Night at Club Caliente on May 20th, 9:00 PM
        ```

    - Subscriber:
        ```
        java -cp /path/to/pub-sub-project-1.0-SNAPSHOT.jar edu.scu.distributed.client.UserClient subscriber 192.168.1.114 8071 192.168.1.114 6005
        ```
        Subscribe to topics:
        ```
        subscribe 192.168.1.114 6000 /sports_event
        subscribe 192.168.1.114 6000 /art_event
        subscribe 192.168.1.114 6000 /dance_event
        ```
        Get messages:
        ```
        getMessages 192.168.1.114 6000 /sports_event
        getMessages 192.168.1.114 6000 /art_event
        getMessages 192.168.1.114 6000 /dance_event
        ```

## Event-based PubSub:

PubSubModel operates on an event-driven architecture where publishers generate events (messages) and subscribers react to those events based on their subscribed topics, enabling efficient and scalable communication in distributed systems.

## Bay Area Events Example:

This application can be used to publish and subscribe to Bay Area events across different categories like sports, art, and dance. Publishers can broadcast events specific to these categories, and subscribers can choose which types of events they want to receive updates on.
