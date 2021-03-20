/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;
import org.easymock.EasyMock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author elmer_interiano
 */
public class ClientVideoClubServiceTest {
    private IVideoClubService remoteVideoClubServiceMock;
    private IVideo Video28Mock;
    public ClientVideoClubServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    
    protected void setUp() throws Exception {
       // super.setUp();
        Video28Mock = EasyMock.createMock(IVideo.class);
        remoteVideoClubServiceMock
                = EasyMock.createMock(IVideoClubService.class);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getVideo method, of class ClientVideoClubService.
     */
    @Test
    public void testGetVideo() throws Exception{
        EasyMock.expect(remoteVideoClubServiceMock.getVideo(28))
                .andReturn(Video28Mock);
        EasyMock.replay(remoteVideoClubServiceMock);
        IVideoClubService clientVideoClubService
                = new clientVideoClubService(remoteVideoClubServiceMock);
        IVideo result = clientVideoClubService.getVideo(28);
        assertEquals(Video28Mock, result);
        EasyMock.verify(remoteVideoClubServiceMock);
    }

    public void testClientVideoClubService() {
        try {
            new ClientVideoClubService(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
// expected
        }
        new ClientVideoClubService(remoteVideoClubServiceMock);
    }

}
