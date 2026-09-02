# Extension Validation Report

- Extension: tachiyomi-en.weebcentral-v1.6.25
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
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
- Selected manga input: popular offset 0: Blue Lock (`.../Blue-Lock`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | Blue Lock (`.../Blue-Lock`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 32 | Absolute Sword Sense (`.../absolute-sword-sense`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 32 | The Tale of Luvelia Kingdom (`.../the-tale-of-luvelia-kingdom`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 32 | The Fox Club (`.../The-Fox-Club`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Blue Lock (`.../Blue-Lock`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Blue Lock (`.../Blue-Lock`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 360 | Chapter 1 (`.../01J76XZ2SJ0NRW2KYE07NRP41E`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 75 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Blue Lock, URL=`.../Blue-Lock` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 130/130 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 130/130 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://temp.compsci88.com/.../01J76XYD7E91K8QP6CY0Y53900.webp` (image/webp (encoding: lossy), 39600 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../Blue-Lock` |  |  |  |
| details thumbnail URL | PASS | `https://temp.compsci88.com/.../01J76XYD7E91K8QP6CY0Y53900.webp` |  |  |  |
| details author | PASS | KANESHIRO Muneyuki, NOMURA Yuusuke |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, Shounen, Sports, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | After a disastrous defeat at the 2018 World Cup, Japan's team struggles to regroup. But what's missing? An absolute Ace Striker, who can guide them to the win. The Japan Football Union is hell-bent on creating a striker who hungers for goals and thirsts for victory, and who can be the decisive instrument in turning around a losing match and to do so, they've gathered 300 of Japan's best and brightest youth players. Who will emerge to lead the team and will they be able to out-muscle and out-ego everyone who stands in their way?<br><br>Related Series(s):<br>- \[Blue Lock: Episode Nagi\](https://weebcentral.com/.../01J76XYFXE2AX9CYRF55D6VM99) (Side Story)<br><br>Tracker(s):<br>- \[Official Source\](https://kodansha.us/.../blue-lock)<br>- \[AniList\](https://anilist.co/.../Blue-Lock)<br>- \[MangaUpdates\](https://www.mangaupdates.com/.../blue-lock) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 360 chapters |  |  |  |
| chapter dates | PASS | 360 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 75 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hot.planeptune.us/.../0001-001.png` (image/jpeg, 192080 bytes, 1123x1600; server Content-Type: image/png) |  |  |  |
