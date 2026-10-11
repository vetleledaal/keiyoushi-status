# Extension Validation Report

- Extension: tachiyomi-tr.webtoonoku-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5965966687692704047
- Source name: WebtoonOku
- Source language: tr
- Selected manga input: popular offset 0: Martial Peak (`.../martial-peak`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Martial Peak (`.../martial-peak`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Felaket Büyücüsü (`.../felaket-buyucusu`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Hapçı Prens (`.../hapci-prens`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Eleceed (`.../eleceed-okutoon`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Martial Peak (`.../martial-peak`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Martial Peak (`.../martial-peak`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3839 | Ch 1 (`.../martial-peak-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`martial-peak` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 96/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://webtoonoku.org/.../Martial-Peak-300x400.jpg` (image/jpeg, 33047 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `martial-peak` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://webtoonoku.org/.../Martial-Peak.jpg` (image/jpeg, 62838 bytes, 452x640) |  |  |  |
| details author | PASS | Pikapi |  |  |  |
| details artist | PASS | Momo (II) |  |  |  |
| details genres | PASS | Aksiyon, DOĞAÜSTÜ, Drama, FANTASTİK, Komedi, MACERA, Manhua, Romantik |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Dövüş sanatlarının zirvesine olan yolculuk kasvetli, yalnız ve uzundur. Hayatta kalmalı ve pes etmemelisin. En güçlü olmak için tek gereken kırıp geçmek ve yolculuğuna devam etmektir. Gökyüzü Testleri öğrencileri en acımasız şekilde bu yolculuğa hazırlar. Bir gün ezik bir süpürgeci onu dövüş sanatlarının zirvesine taşıyacak olan kara bir kitap elde eder. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3839 chapters |  |  |  |
| chapter dates | PASS | 3839 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-2.webtoon-oku.net/.../003.jpg` (image/jpeg, 272935 bytes, 800x1132) |  |  |  |
