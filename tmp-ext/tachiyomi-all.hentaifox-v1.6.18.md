# Extension Validation Report

- Extension: tachiyomi-all.hentaifox-v1.6.18
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 7945033982379409892
- Source name: HentaiFox
- Source language: en
- Selected manga input: popular offset 0: Ane to no Nichijō Kaiwa | Everyday Conversations With My Big Sister (`.../121051`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Ane to no Nichijō Kaiwa | Everyday Conversations With My Big Sister (`.../121051`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | Goukaku Iwai no Fudeoroshi Koubi de Kintama Karappo ni Shite Kureru Bakunyuu Gishi | My Big-Breasted Stepsister Let Me Have My First Time With Her Until My Balls Were Empty as a Reward for Passing My Entrance Exams (`.../101281`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Lana's Mom Is a Nurse + a (`.../172037`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | An Open Friend | Convenience Store Freaks (`.../172017`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ane to no Nichijō Kaiwa | Everyday Conversations With My Big Sister (`.../121051`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../121051`) |  | <1s |
| pages | `getPageList(chapter)` | success | 137 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 80/80 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 80/80 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.hentaifox.com/.../thumb.jpg` (image/jpeg, 33864 bytes, 250x337) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../121051` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.hentaifox.com/.../cover.jpg` (image/jpeg, 57376 bytes, 350x472) |  |  |  |
| details author | PASS | hanpatsu zokusei, mejikara scene |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | big breasts, brother, first person perspective, footjob, incest, mosaic censorship, nakadashi, paizuri, sister, sole female, sumata |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Parodies**: original<br><br>**Languages**: english, translated<br><br>**Categories**: doujinshi<br><br>**Pages**: 137 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 137 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i2.hentaifox.com/.../1.jpg` (image/jpeg, 215760 bytes, 1280x1728) |  |  |  |
