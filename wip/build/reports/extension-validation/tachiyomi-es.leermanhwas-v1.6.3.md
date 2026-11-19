# Extension Validation Report

- Extension: tachiyomi-es.leermanhwas-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: yiimanga
- Source ID: 8701445043633550960
- Source name: LeerManhwas
- Source language: es
- Selected manga input: popular offset 0: Novato de Nivel 99 (`.../novato-de-nivel-99`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Novato de Nivel 99 (`.../novato-de-nivel-99`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | El único hombre en la unidad militar (`.../el-unico-hombre-en-la-unidad-militar`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Novato de Nivel 99 (`.../novato-de-nivel-99`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Novato de Nivel 99 (`.../novato-de-nivel-99`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 35 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 52 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Novato de Nivel 99, URL=`.../novato-de-nivel-99` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Embiste y conquista, URL=`.../embiste-y-conquista` at page 1 offset 22 and page 2 offset 1 |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://leermanhwas.com/.../novato-de-nivel-99-thumbnail.jpg` (image/jpeg, 32258 bytes, 233x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../novato-de-nivel-99` |  |  |  |
| details thumbnail URL | PASS | `https://leermanhwas.com/.../novato-de-nivel-99-thumbnail.jpg` |  |  |  |
| details author | PASS | WUHUZALIANG |  |  |  |
| details artist | PASS | Erhu Cang Jian |  |  |  |
| details genres | PASS | Accion, Fantasia, Shonen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Traicionado y abandonado a su suerte por sus propios compañeros, Bu Jin renace con un profundo deseo de venganza.<br><br>Esta vez, está decidido a recuperar la gloria de la familia Bu y hacer pagar a los miserables que lo traicionaron en su vida pasada.<br><br>Además, tiene un objetivo aún mayor: convertirse en el único Dios de la Guerra de rango SSS en «El Mundo de los Nueve».<br><br>¡Su legendario viaje hacia la cima, lleno de poder, batallas y venganza, comienza ahora!<br><br>Alternative names: Chongsheng zhi Zhanshi Wei Wang/ I May Be a Beginner, but I’m Actually a Level 99 Overpowered Player/ I'm a Beginner, but I'm Actually the Strongest Level 99 Player/ I’m a Beginner, But I’m Actually the Strongest Level 99 Player/ Rebirth of the Warrior King/ Rebirth: Warrior Becomes King/ 复仇从转职成战神开始/ 復仇從轉職成戰神開始/ 重生之战士为王 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | LINT | 1 of 35 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn01.leermanhwas.com/.../001.webp` (image/webp (encoding: lossy), 63554 bytes, 1024x1536) |  |  |  |
