package com.ericom.jenkins

/**
 * Created by lev on 5/20/17.
 */
class BuildHelper {

    def readExecutedShell() {
        def proc = "ls -al".execute()
        def out = new StringBuilder()
        def err = new StringBuilder()

        proc.consumeProcessOutput(out, err)

        return new Tuple2<>(out.toString(), err.toString())
    }
}
