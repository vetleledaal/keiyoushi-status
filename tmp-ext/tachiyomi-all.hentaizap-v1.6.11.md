# Extension Validation Report

- Extension: tachiyomi-all.hentaizap-v1.6.11
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 3055889891446984546
- Source name: HentaiZap
- Source language: en
- Selected manga input: popular offset 0: Aunt Hina (Bobtheneet) (`.../1333515`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Aunt Hina (Bobtheneet) (`.../1333515`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | [Artist] - Soraoraora (Uncensored) [HIATUS] (`.../1499023`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | [Tremhunter] Subterran Exchange X-team program ( in progress) eng (`.../1635522`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | [KrasMazoff] SIGNALIS collection (`.../1635464`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Aunt Hina (Bobtheneet) (`.../1333515`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Aunt Hina (Bobtheneet) (`.../1333515`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../1333515`) |  | <1s |
| pages | `getPageList(chapter)` | success | 68 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Aunt Hina (Bobtheneet), URL=`.../1333515` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://m9.hentaizap.com/.../thumb.jpg` (image/jpeg, 47367 bytes, 250x343) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../1333515` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | elijahzx |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ahegao, anal, anal intercourse, aunt, bbw, big areolae, big ass, big breasts, big penis, blowjob, comic, condom, dark nipples, deepthroat, full color, hairy, hairy armpits, huge breasts, lactation, milf, nakadashi, ponytail, smell, sole female, sole male, stomach deformation, sweating, tall girl, x-ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Languages**: english<br><br>**Category**: western<br><br>Pages: 68 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://m9.hentaizap.com/.../1.webp` (image/webp (encoding: lossy), 230070 bytes, 1280x1759) |  |  |  |
