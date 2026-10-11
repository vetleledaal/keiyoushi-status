# Extension Validation Report

- Extension: tachiyomi-all.simplyhentai-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 33
- Lint: 3
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 298934354390867671
- Source name: Simply Hentai
- Source language: en
- Selected manga input: popular offset 0: GNO: Girl's Night Out - Issue 02 (`.../gno-girls-night-out-issue-02-34b87a4`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | GNO: Girl's Night Out - Issue 02 (`.../gno-girls-night-out-issue-02-34b87a4`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Spinel's Gang Bang - NamyNSFW (`.../spinels-gang-bang-namynsfw`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Ebina Ebi Feminization Pandemic!! ~Sugar Daddy Chapter~ (`.../ebina-ebi-feminization-pandemic-sugar-daddy-chapter`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | NEVERTHELESS AFTER (`.../nevertheless-after`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | GNO: Girl's Night Out - Issue 02 (`.../gno-girls-night-out-issue-02-34b87a4`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../all-pages`) |  | <1s |
| pages | `getPageList(chapter)` | success | 354 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.sh-cdn.com/.../thumb_3443f0e3.webp` (image/webp (encoding: lossy), 69440 bytes, 480x685) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../gno-girls-night-out-issue-02-34b87a4` |  |  |  |
| details thumbnail URL | PASS | `https://images.sh-cdn.com/.../thumb_3443f0e3.webp` |  |  |  |
| details author | PASS | uselessbegging |  |  |  |
| details artist | PASS | uselessbegging |  |  |  |
| details genres | PASS | Anal, anal intercourse, ball sucking, Beauty Mark, big penis, Bisexual, Blowjob, Bukkake, Condom, cunnilingus, dark nipples, Dark Skin, Deepthroat, Defloration, dickgirl on dickgirl, dickgirl on female, dickgirl on male, exhibitionism, fft threesome, Frottage, full censorship, full-packaged futanari, Futanari, glasses, Group, hairy, hidden sex, Impregnation, Kissing, large tattoo, male on dickgirl, Mesuiki, MILF, mtf threesome, multi-work series, Multiple Orgasms, Muscle, Nakadashi, piercing, Rimjob, Sex Toys, smoking, story arc, Strap-on, Sweating, swinging, Teacher, ttf threesome, Yaoi |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Series: original<br>Characters:  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 354 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.sh-cdn.com/.../3443f0e3.webp` (image/webp (encoding: lossy), 474124 bytes, 1280x1810) |  |  |  |
