# Extension Validation Report

- Extension: tachiyomi-all.mangafire-v1.6.34
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 6084907896154116083
- Source name: MangaFire
- Source language: en
- Selected manga input: latest offset 0: Tsuki no Joou no Nekashitsukekata (`.../y2m3z-tsuki-no-joou-no-nekashitsukekata`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | One Piece (`.../dkw-one-piece`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 50 | Hunter x Hunter (`.../9onq-hunter-x-hunter`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | Tsuki no Joou no Nekashitsukekata (`.../y2m3z-tsuki-no-joou-no-nekashitsukekata`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Shinu Unmei ni Aru Akuyaku Reijou no Ani ni Tensei Shita node, Imouto o Sodatete Mirai o Kaetai to Omoimasu: Sekai Saikyou wa Ore dakedo, Sekai Saikawa wa Imouto ni Chigainai (`.../nk31k-shinu-unmei-ni-aru-akuyaku-reijou-no-ani-ni-tensei-shita-node-imouto-o-sodatete-mirai-o-kaetai-to-omoimasu-sekai-saikyou-wa-ore-dakedo-sekai-saikawa-wa-imouto-ni-chigainai`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 50 | Tsuki no Joou no Nekashitsukekata (`.../y2m3z-tsuki-no-joou-no-nekashitsukekata`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tsuki no Joou no Nekashitsukekata (`.../y2m3z-tsuki-no-joou-no-nekashitsukekata`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 9 | Ch. 1 - The Queen Cannot Sleep (`.../8958100-chapter-1-en`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 53 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tsuki no Joou no Nekashitsukekata, URL=`.../y2m3z-tsuki-no-joou-no-nekashitsukekata` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 250/250 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 250/250 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.mfcdn.nl/.../08afd9482021a0452ec7f24eb178d7c2.jpg` (image/jpeg, 59694 bytes, 400x600; server Content-Type: image/jpg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../y2m3z-tsuki-no-joou-no-nekashitsukekata` |  |  |  |
| details thumbnail URL | PASS | `https://static.mfcdn.nl/.../08afd9482021a0452ec7f24eb178d7c2.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | New editor Yaichiro Hitsujiya is avoided by the authors he manages because his calm and gentle personality tends to make them fall asleep during meetings. Despite this, he is determined to support them however he can. When he is tasked with delivering documents to the famous and notoriously strict author Sumika Tsukishiro, he finds her exhausted and acting like a child due to severe sleep deprivation. To help her finish her work, Yaichiro makes an unexpected decision: first, he has to get her to sleep. Thus begins a heartwarming and comedic story between a kind-hearted editor and a talented but overworked novelist. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 9 chapters |  |  |  |
| chapter dates | PASS | 9 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 53 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://m3z.mfcdn1.xyz/.../p.jpg` (image/jpeg, 486557 bytes, 2448x1399) |  |  |  |
