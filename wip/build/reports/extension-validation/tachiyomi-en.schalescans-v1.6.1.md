# Extension Validation Report

- Extension: tachiyomi-en.schalescans-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 135437514280789093
- Source name: Schale Scans
- Source language: en
- Selected manga input: popular offset 0: Eroi Skill de Isekai Musou (`.../22723753-a171-406a-86f1-b2d534fc4f58`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 52 | Eroi Skill de Isekai Musou (`.../22723753-a171-406a-86f1-b2d534fc4f58`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Eroi Skill de Isekai Musou (`.../22723753-a171-406a-86f1-b2d534fc4f58`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Eroi Skill de Isekai Musou (`.../22723753-a171-406a-86f1-b2d534fc4f58`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Vol. 1 Ch. 2 (`.../a5c41a42-7fa3-4136-b92d-e8a77547825d`) |  | <1s |
| pages | `getPageList(chapter)` | success | 33 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 52 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Eroi Skill de Isekai Musou, URL=`22723753-a171-406a-86f1-b2d534fc4f58` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 53/53 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 53/53 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.schalescans.com/.../69efd966-7a5c-4c97-b0cf-48730a9c2bd2.jpg.512.jpg` (image/jpeg, 157840 bytes, 512x728) |  |  |  |
| details identity | PASS | Details preserved selected URL `22723753-a171-406a-86f1-b2d534fc4f58` |  |  |  |
| details thumbnail URL | PASS | `https://img.schalescans.com/.../69efd966-7a5c-4c97-b0cf-48730a9c2bd2.jpg.512.jpg` |  |  |  |
| details author | PASS | Masanan |  |  |  |
| details artist | PASS | Yakumi Benishouga |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Fantasy, Isekai |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yasuhiko Akizuki has been accidentally summoned to another world by a goddess. As one of the dime a dozen "heroes," he gets thrown into the world with barely any money and equipment. When he arrives, he's ridiculed by local adventurers for being a "mass produced hero." This is the story of a man who gets through the harsh realities of this classic fantasy by weaponizing his sex skills, and uses them to eventually save the world.  <br>___<br>**Links:**  <br>- \[Official LN (JP)\](https://gcnovels.jp/.../book <redacted query values: search_series>)  <br>- !\[\](https://i.imgur.com/.../HI4jAzg.png) \[Web Novel\](https://novel18.syosetu.com/.../n5305eg)<br><br>Alternative titles:<br>- エロいスキルで異世界無双 THE COMIC<br>- Record of Erotic Warrior<br>- Otherworldly Warriors with Erotic Skills<br>- 使用情色技能在異世界無雙<br><br>Links:<br>- \[MangaDex\](https://mangadex.org/.../f74cd293-aee4-4023-8bb0-3f8d90aea53b)<br>- \[AniList\](https://anilist.co/.../134540)<br>- \[MyAnimeList\](https://myanimelist.net/.../131182)<br>- \[Official raw\](https://www.comicride.jp/.../eromusou)<br>- \[BookWalker\](https://bookwalker.jp/.../296877)<br>- \[Amazon\](https://www.amazon.co.jp/.../B09Z2SNGT9)<br>- \[ebookjapan\](https://ebookjapan.yahoo.co.jp/.../635567) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.schalescans.com/.../001.jpg` (image/gif (format: 89a), 1064949 bytes, 1350x1920; server Content-Type: image/jpeg) |  |  |  |
