# Extension Validation Report

- Extension: tachiyomi-es.cerberusseries-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 1814471239661920836
- Source name: Cerberus Series
- Source language: es
- Selected manga input: latest offset 0: Apocalipsis demoníaco (`.../apocalipsis-demoniaco`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | GACHA INFINITA (`.../gacha-infinita-nivel-9999`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Todo comienza con un grupo de personas primitivas (`.../todo-comienza-con-un-grupo-de-personas-primitivas`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Apocalipsis demoníaco (`.../apocalipsis-demoniaco`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | GACHA INFINITA (`.../gacha-infinita-nivel-9999`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Apocalipsis demoníaco (`.../apocalipsis-demoniaco`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Apocalipsis demoníaco (`.../apocalipsis-demoniaco`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 2 | Chapter 01 (`.../01-128`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Apocalipsis demoníaco, URL=`.../apocalipsis-demoniaco` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i1.wp.com/.../apocalipsis-demoniaco.jpg <redacted query values: resize>` (image/jpeg, 48272 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../apocalipsis-demoniaco` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i1.wp.com/.../apocalipsis-demoniaco.jpg` (image/jpeg, 380189 bytes, 848x1232) |  |  |  |
| details author | PASS | Coin Toss, PSG |  |  |  |
| details artist | PASS | Victor |  |  |  |
| details genres | PASS | Action, Fantasy, Martial arts, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | El Demonio Celestial ha ascendido a los cielos, y todo lo que existe bajo el cielo será consumido por el Camino Demoníaco. Y así, la Secta Wudang fue aniquilada. Han pasado diez años desde que el Camino Demoníaco comenzó a gobernar el mundo. Yu Su, el único superviviente de la Secta Wudang, vaga por un mundo dominado por el Camino Demoníaco, siguiendo el último deseo de su maestro, Sunyang: Sobrevive. 0 0 votes Article Rating<br><br>Nombres alternativos: 천마 아포칼립스 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | details: `https://legionscans.com/.../apocalipsis-demoniaco` to `https://legionscans.com/.../apocalipsis-demoniaco` (1 redirects); chapters: `https://legionscans.com/.../apocalipsis-demoniaco` to `https://legionscans.com/.../apocalipsis-demoniaco` (1 redirects); pages: `https://legionscans.com/.../01-128` to `https://legionscans.com/.../01-128` (1 redirects) |  |  |  |
| page load | PASS | `https://i0.wp.com/.../3ufd0S.png` (image/webp (container: extended), 193504 bytes, 849x1208) |  |  |  |
