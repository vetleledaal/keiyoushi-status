# Extension Validation Report

- Extension: tachiyomi-tr.okutoon-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6023377011056301844
- Source name: OkuToon
- Source language: tr
- Selected manga input: popular offset 0: SSS-Class Suicide Hunter (`.../sss-class-suicide-hunter`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | SSS-Class Suicide Hunter (`.../sss-class-suicide-hunter`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Magic Emperor (`.../magic-emperor`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Girl's Baduk (`.../girl-s-baduk`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Juvenile Offender (`.../juvenile-offender`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | SSS-Class Suicide Hunter (`.../sss-class-suicide-hunter`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | SSS-Class Suicide Hunter (`.../sss-class-suicide-hunter`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 155 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=SSS-Class Suicide Hunter, URL=`.../sss-class-suicide-hunter` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://om-cdn.okutoon.com/.../cover_1783784020_a5f83260.webp` (image/webp (encoding: lossy), 58930 bytes, 600x876) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../sss-class-suicide-hunter` |  |  |  |
| details thumbnail URL | PASS | `https://om-cdn.okutoon.com/.../cover_1783784020_a5f83260.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Kim Gong-Ja'nın hayattaki en büyük isteği, kuledeki güçlü avcılar gibi özel bir yetenek kazanmaktır. Bir gün bu dileği beklenmedik şekilde gerçekleşir ve sonunda S Sınıfı bir beceri uyandırır. Ancak bu yeteneğin acımasız bir şartı vardır. Gücü yalnızca öldüğü anda devreye girer. İlk bakışta işe yaramaz gibi görünen bu yetenek, Gong-Ja'nın kaderini tamamen değiştirir. Ölümle iç içe ilerleyen bu yolculukta hem kuledeki dengeler sarsılır hem de onun azmi, kıskançlığı ve hayatta kalma isteği bambaşka bir güce dönüşür. SSS-Class Suicide Hunter, aksiyon ve fanteziyi karanlık bir mizah ve duygusal anlarla birleştiren, yüksek tempolu bir kule serisidir. Güç kazanmanın bedelini, tekrar tekrar ölerek ödemek zorunda kalan bir avcının hikayesini etkileyici bir şekilde anlatır. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 155 chapters |  |  |  |
| chapter dates | PASS | 155 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 403 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
