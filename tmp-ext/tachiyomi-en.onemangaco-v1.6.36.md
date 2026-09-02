# Extension Validation Report

- Extension: tachiyomi-en.onemangaco-v1.6.36
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6314378952940608115
- Source name: 1Manga.co
- Source language: en
- Selected manga input: popular offset 0: Sweet Guy (`.../sweet-guy_122`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Sweet Guy (`.../sweet-guy_122`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Mercenary Enrollment (`.../mercenary-enrollment`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | A Royal Rebound: Forget My Ex-Fiancé, I'm Being Pampered By The Prince! (`.../a-royal-rebound-forget-my-ex-fianc-i-m-being-pampered-by-the-prince`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | The Player That Can't Level Up (`.../the-player-that-can-t-level-up`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sweet Guy (`.../sweet-guy_122`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sweet Guy (`.../sweet-guy_122`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 81 | Chapter 1 (`.../chapter-1.0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 48 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sweet Guy, URL=`.../sweet-guy_122` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://thumb.mghcdn.com/.../shinka-no-mi.jpg` -> 2 manga URLs (examples: `.../shinka-no-mi`, `.../shinka-no-mi-by-miku-sorano`), `https://thumb.mghcdn.com/.../jungle-juice.jpg` -> 2 manga URLs (examples: `.../jungle-juice`, `.../jungle-juice-by`) |  |  |  |
| thumbnail | PASS | `https://thumb.mghcdn.com/.../sweet-guy.jpg` (image/jpeg, 44439 bytes, 200x284) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sweet-guy_122` |  |  |  |
| details thumbnail URL | PASS | `https://thumb.mghcdn.com/.../sweet-guy.jpg` |  |  |  |
| details author | PASS | Lee WonSik (이원식) |  |  |  |
| details artist | PASS | Park Hyeong-jun |  |  |  |
| details genres | PASS | Romance, Comedy, Harem, Supernatural, Long Strip, Web Comic, Full Color, Pornographic, Mature, Webtoons, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Once upon a time there was a loser, but that one day he got the ability. Ask what? Well ... it's hard to explain, he knows how to instruct on "the right path" girls who strayed from it.<br><br>You may also like:<br>+ Refrain Love<br>+ Skill of Lure<br>+ Polyamory<br><br>Alternative Names:<br>- カラダにイイ男 (Japanese)<br>- 몸에 좋은 남자 (Korean)<br>- He Does a Body Good (English)<br>- Man Good for Health<br>- Anh chàng ngọt ngào (Vietnamese - Tiếng Việt - TV)<br>- Sweet Guy Manga<br>- Sweet Guy Manhwa |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 81 chapters |  |  |  |
| chapter dates | PASS | 81 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imgx.mghcdn.com/.../1.jpg` (image/jpeg, 47112 bytes, 720x1346) |  |  |  |
