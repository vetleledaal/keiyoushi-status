# Extension Validation Report

- Extension: tachiyomi-id.komiknesia-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Source ID: 8916278596443930510
- Source name: KomikNesia
- Source language: id
- Selected manga input: popular offset 0: Lookism (`.../lookism`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Lookism (`.../lookism`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 40 | Transmigrating to the Otherworld Once More (`.../transmigrating-to-the-otherworld-once-more`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | I Accidentally Resurrected My Dead Husband (`.../i-accidentally-resurrected-my-dead-husband`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Rita and the Oracle (`.../rita-and-the-oracle`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Lookism (`.../lookism`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Lookism (`.../lookism`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 628 | Chapter 1 (`.../lookism-chapter-1.448178`) |  | <1s |
| pages | `getPageList(chapter)` | success | 105 |  |  | 1-10s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Lookism, URL=`lookism` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image.cdnesia.my.id/.../thumbnail-1783608213508.png` (image/jpeg, 148593 bytes, 810x1080; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `lookism` |  |  |  |
| details thumbnail URL | PASS | `https://image.cdnesia.my.id/.../thumbnail-1783608213508.png` |  |  |  |
| details author | PASS | Unknown |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Comedy, Drama, School life, Shounen, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Park Hyung Suk, kelebihan berat badan dan tidak menarik, diintimidasi dan dilecehkan setiap hari. Tapi keajaiban akan terjadi.<br><br>Alternative Names:<br>Apari3ncias<br>Gaiken Jijou Shugi<br>Gaikenshijousyugi<br>Lookism<br>Дискриминация по внешности<br>Лукизм<br>外見至上主義<br>外貌至上主義<br>看脸时代<br>看臉時代<br>외모지상주의 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 628 chapters |  |  |  |
| chapter dates | PASS | 628 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 105 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://image.cdnesia.my.id/.../1-1783926246734.webp` (image/webp (encoding: lossy), 16592 bytes, 650x929) |  |  |  |
