# Extension Validation Report

- Extension: tachiyomi-en.weebcentral-v1.6.25
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2131019126180322627
- Source name: Weeb Central
- Source language: en
- Selected manga input: popular offset 0: One Piece (`.../One-Piece`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | One Piece (`.../One-Piece`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 32 | Solo Leveling (`.../Solo-Leveling`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 32 | Chanto Suki tte Ieru Ko Musou (`.../chanto-suki-tte-ieru-ko-musou`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 32 | Sono Akuyaku Kizoku, Mama Heroine ga Suki Sugiru ~Shinshi na Doryoku de Saikyou to Nari Fuguu na Oshi Chara Tasukemakuru~ (`.../sono-akuyaku-kizoku-mama-heroine-ga-suki-sugiru-shinshi-na-doryoku-de-saikyou-to-nari-fuguu-na-oshi-chara-tasukemakuru`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 5 | One Piece (`.../One-Piece`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Piece (`.../One-Piece`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1192 | Chapter 1 (`.../01J76XYYR7VK2XCSHBZT8BZ4C2`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 57 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 32 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Piece, URL=`.../One-Piece` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 133/133 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 133/133 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://temp.compsci88.com/.../01J76XY7E9FNDZ1DBBM6PBJPFK.webp` (image/webp (encoding: lossy), 94872 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../One-Piece` |  |  |  |
| details thumbnail URL | PASS | `https://temp.compsci88.com/.../01J76XY7E9FNDZ1DBBM6PBJPFK.webp` |  |  |  |
| details author | PASS | ODA Eiichiro |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Comedy, Drama, Fantasy, Shounen, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | As a child, Monkey D. Luffy dreamed of becoming the King of the Pirates. But his life changed when he accidentally gained the power to stretch like rubber...at the cost of never being able to swim again! Now Luffy, with the help of a motley collection of nakama, is setting off in search of "One Piece," said to be the greatest treasure in the world...<br><br>Related Series(s):<br>- \[Wanted!\](https://weebcentral.com/.../01J76XY8NPW1EH8SFZEXX8ZCRT) (Alternate Story)<br>- \[One Piece - Shokugeki no Sanji\](https://weebcentral.com/.../01J76XYH1QRTNBVJM1KDPWHA6P) (Side Story)<br>- \[One Piece - Ace's Story - The Manga\](https://weebcentral.com/.../01J76XYH1N5PBX33GWTXVXR43F) (Prequel)<br>- \[One Piece (Color)\](https://weebcentral.com/.../01J76XYAQSGEJPXCSCVPQ3MHZM) (Alternate Story)<br>- \[One Piece Party\](https://weebcentral.com/.../01J76XYB7C9TMA6MY4NSGZVEVY) (Spin-Off)<br><br>Tracker(s):<br>- \[Official Source\](https://www.viz.com/.../one-piece)<br>- \[AniList\](https://anilist.co/.../ONE-PIECE)<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../one-piece) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1192 chapters |  |  |  |
| chapter dates | PASS | 1192 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hot.planeptune.us/.../0001-001.png` (image/jpeg, 345017 bytes, 1066x1600; server Content-Type: image/png) |  |  |  |
