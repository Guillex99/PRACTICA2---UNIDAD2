/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

/**
 *
 * @author elmer_interiano
 */
public class ClientVideoClubService {

    private IVideoClubService remoteVideoClubService;

    public ClientVideoClubService(IVideoClubService remoteVideoClubService) {
        if (remoteVideoClubService == null) {
            throw new IllegalArgumentException(
                    "'remoteVideoClubService' must not be null");
        }
        this.remoteVideoClubService = remoteVideoClubService;
    }

    public IVideo getVideo(int VideoNumber) {
        return remoteVideoClubService.getVideo(VideoNumber);
    }
}
