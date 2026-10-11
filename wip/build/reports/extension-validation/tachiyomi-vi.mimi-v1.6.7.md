# Extension Validation Report

- Extension: tachiyomi-vi.mimi-v1.6.7
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2558772350527638641
- Source name: MiMi
- Source language: vi
- Selected manga input: popular offset 0: Tổng hợp sếch của Mana (`.../27652`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 45 | Tổng hợp sếch của Mana (`.../27652`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 45 | Tuyển tập sếch Genshin của memory (`.../61537`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 45 | Khải huyền về sự phồn vinh (`.../70501`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 45 | Cuộc hội ngộ sau 15 năm: mối nhân duyên tuyệt vời (`.../70469`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Khải huyền về sự phồn vinh (`.../70501`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tổng hợp sếch của Mana (`.../27652`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 44 | Burnice (`.../52953`) |  | <1s |
| pages | `getPageList(chapter)` | success | 7 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 45 entries |  |  |  |
| latest listing | PASS | 45 entries |  |  |  |
| search listing | FAIL | No search result matched the selected manga URL or exact title; search result count: 24 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 204/204 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 204/204 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://moe-cdn.net/.../file_1789399498543_b_a.jpg` (image/webp (container: extended), 312504 bytes, 1728x2591) |  |  |  |
| details identity | PASS | Details preserved selected URL `27652` |  |  |  |
| details thumbnail URL | PASS | `https://moe-cdn.net/.../file_1789399498543_b_a.jpg` |  |  |  |
| details author | PASS | Mana, Remana |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Monster, Squirting, Exhibitionist, Rape, Blowjob, Gangbang, Ahegao, Color, Huge Dick, Uncensored, Slave, ArtistCG có thoại, Deepthroat, Sex toys, Big boobs, Tentacles, Pregnant |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Parody: Genshin Impact, Zenless Zone Zero<br><br>Nhân vật: Mualani, Navia Caspar, Raiden Shogun, Kokomi Sangonomiya, Wise, Yae Miko, Yanagi Tsukishiro, Aether, Arlecchino, Belle, Burnice, Candace, Chiori, Clorinde, Dehya, Furina, Ju Fufu, Keqing, Miyabi Hoshimi, Yixuan, Astra Yao, Jean Gunnhildr, Evelyn Chevalier<br><br>Code author: 2995, 2059<br><br>Code manga: 27652<br><br>Theo dõi (hoặc nhờ vả) tôi ở fb.com/sygik hoặc Discord @sygik<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 44 chapters |  |  |  |
| chapter dates | PASS | 44 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://moe-cdn.net/.../file_1744740753538_Burnice_A_jpg` (image/jpeg, 2004706 bytes, 2591x3624; server Content-Type: img/jpeg) |  |  |  |
