# Extension Validation Report

- Extension: tachiyomi-en.doujins-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 2
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3733450486998805728
- Source name: Doujins
- Source language: en
- Selected manga input: popular offset 0: The Virgin and The Magic Lamp (`.../ushinomiya-the-virgin-and-the-magic-lamp-106045`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 71 | The Virgin and The Magic Lamp (`.../ushinomiya-the-virgin-and-the-magic-lamp-106045`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 26 | SHUTTER + AFTER (`.../laliberte-shutter-after-106522`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 23 | How Does it Feel to have Sex with your Mom? Part 2 (`.../templicher-how-does-it-feel-to-have-sex-with-your-mom-part-2-106363`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Virgin and The Magic Lamp (`.../the-virgin-and-the-magic-lamp-106045`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Virgin and The Magic Lamp (`.../ushinomiya-the-virgin-and-the-magic-lamp-106045`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../ushinomiya-the-virgin-and-the-magic-lamp-106045`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 71 entries |  |  |  |
| latest listing | PASS | 26 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=The Virgin and The Magic Lamp, URL=`.../the-virgin-and-the-magic-lamp-106045` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.doujins.com/.../f2-8pp8ssk7.jpg <redacted query values: st and e> 2x` (image/jpeg, 73906 bytes, 364x520) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ushinomiya-the-virgin-and-the-magic-lamp-106045` |  |  |  |
| details thumbnail URL | PASS | `https://static.doujins.com/.../f2-8pp8ssk7.jpg <redacted query values: st and e> 2x` |  |  |  |
| details author | PASS | Ushinomiya |  |  |  |
| details artist | PASS | Ushinomiya |  |  |  |
| details genres | PASS | Dark Skin, big breasts, blowjob, breast expansion, clone, collar, elf, ffm threesome, orgasm denial, paizuri, ponytail, toys, very long hair, virginity |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://static.doujins.com/.../n-8pz86y6b.webp <redacted query values: st and e>` (image/webp (encoding: lossy), 167896 bytes, 1063x1500) |  |  |  |
