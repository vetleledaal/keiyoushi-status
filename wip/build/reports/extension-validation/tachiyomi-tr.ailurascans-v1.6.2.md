# Extension Validation Report

- Extension: tachiyomi-tr.ailurascans-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: duckscans
- Source ID: 4640901502504370696
- Source name: Ailura Scans
- Source language: tr
- Selected manga input: popular offset 0: Hayranlığını Gizleyen Prenses (`.../hayranligini-gizleyen-prenses`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 124 | Hayranlığını Gizleyen Prenses (`.../hayranligini-gizleyen-prenses`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 124 | Düşes Bugün için Yaşıyor (`.../duses-bugun-icin-yasiyor`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Hayranlığını Gizleyen Prenses (`.../hayranligini-gizleyen-prenses`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Hayranlığını Gizleyen Prenses (`.../hayranligini-gizleyen-prenses`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 109 | Bölüm 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 22 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 124 entries |  |  |  |
| latest listing | PASS | 124 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Hayranlığını Gizleyen Prenses, URL=`.../hayranligini-gizleyen-prenses` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 249/249 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 249/249 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ailurascans.com/.../hayranligini-gizleyen-prenses.webp <redacted query values: v>` (image/webp (encoding: lossy), 237612 bytes, 800x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../hayranligini-gizleyen-prenses` |  |  |  |
| details thumbnail URL | PASS | `https://ailurascans.com/.../hayranligini-gizleyen-prenses.webp <redacted query values: v>` |  |  |  |
| details author | PASS | Saeseng |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kanlı canlı hayranı olduğum karakterin (bias) bulunduğu bir romanın içine reenkarne oldum.<br>Üstelik şimdi, her türlü sıfatla anılan İmparatorluk Prensesi Agnes Saint’im!<br>Korkunç derecede zengin ve asil olmak harika ama ufak bir sorun var…<br>Az önce hayran olduğum adamın varlığına hakaret eden o iğrenç pislik, ‘benden’ başkası değil.<br>Yine de artık buradayım ve…<br>Hayranı olduğum karakterin ölümünü engellemek ve bundan sonra işlerinin yaver gitmesini sağlamak için elimden gelen her şeyi yapacağım!<br>Yavru kedim Kylo’nun en ufak bir sarsıntı yaşamasını asla istemem.<br>İşte bu yüzden ona olan tutkulu hayranlığımı gizlemek zorundayım.<br>Zaten fanatikliğimi açık etmenin kimseye bir faydası olmaz.<br>Bu yüzden, bir süreliğine şu konuda kusursuz olacağım…<br>‘Gizli hayranlık.’ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 109 chapters |  |  |  |
| chapter dates | PASS | 109 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ailurascans.com/.../001.webp <redacted query values: v, t, s, k, and sv>` (image/jpeg, 1146043 bytes, 800x8000; server Content-Type: application/octet-stream) |  |  |  |
