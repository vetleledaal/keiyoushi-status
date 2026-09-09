# Extension Validation Report

- Extension: tachiyomi-en.nyxscans-v1.6.31
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
- Source theme: iken
- Source ID: 419822582289753882
- Source name: Nyx Scans
- Source language: en
- Selected manga input: popular offset 0: Operation: True Love (`.../operation-true-love`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 17 | Operation: True Love (`.../operation-true-love`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | Press Play, Sami (`.../press-play-sami`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Borderline (`.../borderline`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Erika: My Friend Is Obsessed with Me (`<redacted URL #1: selected resource; absolute; invalid web scheme; workstation or local network>`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Operation: True Love (`.../operation-true-love`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Operation: True Love (`.../operation-true-love`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 144 | Chapter 0 - Prologue (`.../chapter-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 82 |  |  | 1-10s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Operation: True Love, URL=`operation-true-love#9` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 70/70 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 70/70 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://media.nyxscans.com/.../b5196bdc-ede4-43c7-87cc-073710686042.webp` (image/webp (encoding: lossy), 130724 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `operation-true-love#9` |  |  |  |
| details thumbnail URL | PASS | `https://media.nyxscans.com/.../b5196bdc-ede4-43c7-87cc-073710686042.webp` |  |  |  |
| details author | PASS | kkokkalee |  |  |  |
| details artist | PASS | Dledumb |  |  |  |
| details genres | PASS | Manhwa, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | It’s hard dating someone who won’t give you the time of day. Su-ae Shim knows that better than anyone, having dated her indifferent boyfriend, Minu Kang, for years. She sometimes wishes she could be more like her charismatic stepsister, Ra-im, who seems to have it all. But life takes a turn for the weird when Su-ae discovers Jellypop, a sentient flip phone, in her locker. Jellypop has a lot to say about her love life, especially as Su-ae drifts further away from Minu and finds herself running into Minu’s friend, Eunhyeok. Add to the mix a growing suspicion that Minu and Ra-im might be more than friends, and Su-ae might need a miracle to navigate the ups and downs of high school romance!<br><br>Alternative Names: Operation: True Love, Operation Name Pure Love, Pure Love Operation, 작전명 순정 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 144 chapters |  |  |  |
| chapter dates | PASS | 144 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 82 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://media.nyxscans.com/.../image_1_f8699722.webp` (image/webp (encoding: lossy), 89002 bytes, 800x1000) |  |  |  |
