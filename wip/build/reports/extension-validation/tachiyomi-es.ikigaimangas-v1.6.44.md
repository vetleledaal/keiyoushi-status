# Extension Validation Report

- Extension: tachiyomi-es.ikigaimangas-v1.6.44
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 1
- Skipped: 3
- Failed: 3
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7749406396573482811
- Source name: Ikigai Mangas
- Source language: es
- Selected manga input: latest offset 0: Dúo de baile - historia corta (`.../duo-de-baile-historia-corta`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 100 | Jinx (`.../jinx-manhwa`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Dúo de baile - historia corta (`.../duo-de-baile-historia-corta`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Un Mal Esposo (`.../un-mal-esposo`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | keiyoushi.b.v: Timed out waiting for WebView after 20s | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dúo de baile - historia corta (`.../duo-de-baile-historia-corta`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Capítulo 0: Pologo (`.../1211405488842997762`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 4 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | ERROR | keiyoushi.b.v: Timed out waiting for WebView after 20s | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | SKIP | Timed out waiting for WebView after 20s |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 140/140 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 140/140 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://image2.ikigaimangas.cloud/.../czM6Ly9pa2lnYWktY2RuL3Nlcmllcy9jb3ZlcnMvMTIxMTQwNDkyNDA3NTA4MTczMS96QmJBNFl6RUU5VWZlYU95Qmt2U0ZTWXd2QU5qc2otbWV0YU5DNXFjR2M9LS53ZWJw.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `duo-de-baile-historia-corta` |  |  |  |
| details thumbnail URL | FAIL | Differs from selected listing thumbnail; Thumbnail URL `https://image2.ikigaimangas.cloud/.../czM6Ly9pa2lnYWktY2RuL3Nlcmllcy9jb3ZlcnMvMTIxMTQwNDkyNDA3NTA4MTczMS96QmJBNFl6RUU5VWZlYU95Qmt2U0ZTWXd2QU5qc2otbWV0YU5DNXFjR2M9LS53ZWJw.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance, +18, Boys Love, Yaoi, Adulto |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Cortos de MrBLUE del mes de octubre................... Fecha de lanzamiento 24 de setiembre |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://visualikigai.com` to `https://visualikigai.cmpunjabrashancard.pk` (3 redirects); popular: `https://visualikigai.com <redacted query values: pagina>` to `https://visualikigai.cmpunjabrashancard.pk <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../clasificacion` to `https://visualikigai.cmpunjabrashancard.pk/.../clasificacion` (3 redirects); popular: `https://visualikigai.com <redacted query values: pagina>` to `https://visualikigai.cmpunjabrashancard.pk <redacted query values: pagina>` (3 redirects); popular: `https://visualikigai.com/.../duo-de-baile-historia-corta` to `https://visualikigai.cmpunjabrashancard.pk/.../duo-de-baile-historia-corta` (3 redirects); popular: `https://visualikigai.com` to `https://visualikigai.cmpunjabrashancard.pk` (3 redirects); popular: `https://visualikigai.com/.../duo-de-baile-historia-corta` to `https://visualikigai.cmpunjabrashancard.pk/.../duo-de-baile-historia-corta` (3 redirects); popular: `https://visualikigai.com/.../1211405488842997762` to `https://viralikigai.radiot.space/.../1211405488842997762 <redacted query values: forceSetTheme, forceSetNsfw, and userHasLogin>` (5 redirects) |  |  |  |
| page load | PASS | `https://image3.ikigaimangas.cloud/.../BannerConcursoTiktok.jpg` (image/jpeg, 537233 bytes, 1277x602) |  |  |  |
