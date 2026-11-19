# Extension Validation Report

- Extension: tachiyomi-es.eternalmangas-v1.6.32
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5749284484000945259
- Source name: EternalMangas
- Source language: es
- Selected manga input: popular offset 0: A quien intentaba seducir era a la señora (`.../a-quien-intentaba-seducir-era-a-la-senora`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 29 | A quien intentaba seducir era a la señora (`.../a-quien-intentaba-seducir-era-a-la-senora`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | El amanecer que asfixia (`.../el-amanecer-que-asfixia`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Transformación Incompleta (`.../transformacion-incompleta`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A quien intentaba seducir era a la señora (`.../a-quien-intentaba-seducir-era-a-la-senora`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A quien intentaba seducir era a la señora (`.../a-quien-intentaba-seducir-era-a-la-senora`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 8 | Capítulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | <1s |

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
| popular listing | PASS | 29 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A quien intentaba seducir era a la señora, URL=`a-quien-intentaba-seducir-era-a-la-senora` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 78/78 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 78/78 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.eternalmangas.org/.../cover-oLtn6Btl.webp` (image/webp (encoding: lossy), 85608 bytes, 720x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `a-quien-intentaba-seducir-era-a-la-senora` |  |  |  |
| details thumbnail URL | PASS | `https://storage.eternalmangas.org/.../cover-oLtn6Btl.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | BL Manhwa, +18, BL, Problemas Familiares |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Nakha, que cayó en la dinastía Joseon, poseía el cuerpo de un hombre sólido y terso, ni real ni noble. Mientras deambulaba por las calles, se enamoró de una dama de buen corazón y empezó a trabajar como sirviente. Pero intentó convertirse en un hombre guapo por primera vez en su vida para seducir a la dama de buen corazón, que vivía en un ambiente donde ni siquiera podía comer carne, afirmando ser la familia más rica de las ocho provincias de Joseon. Pero ¿por qué este maestro, y no mi esposa, me llama en secreto a la habitación...?<br><br>Título alternativo: 내가 꼬시려던 건 마님이었는데 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 8 chapters |  |  |  |
| chapter dates | PASS | 8 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://storage.eternalmangas.org/.../01.webp` (image/webp (encoding: lossy), 546168 bytes, 720x9690) |  |  |  |
