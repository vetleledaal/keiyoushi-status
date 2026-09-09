# Extension Validation Report

- Extension: tachiyomi-es.leermangaesp-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8196066207928937350
- Source name: LeerMangaEsp
- Source language: es
- Selected manga input: popular offset 0: Blue Lock (`.../blue-lock`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 14 | Blue Lock (`.../blue-lock`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 140 | Oni no Hanayome (`.../oni-no-hanayome`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Blue Lock (`.../blue-lock`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Blue Lock (`.../blue-lock`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 368 | Capítulo 1.00 (`.../1.00`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 79 |  |  | <1s |

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
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 140 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Blue Lock, URL=`blue-lock` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 155/155 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 155/155 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.mangalect.org/.../Blue_Lock.webp` (image/webp (encoding: lossy), 26372 bytes, 300x450; server Content-Type: binary/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `blue-lock` |  |  |  |
| details thumbnail URL | PASS | `https://images.mangalect.org/.../Blue_Lock.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acción, Drama, Psicológico, Supervivencia, Deporte |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tras perder la oportunidad de clasificar al campeonato nacional de escuelas secundarias—al ceder el balón a un compañero que desperdició la ocasión de anotar—el delantero Yoichi Isagi se enfrenta a un futuro incierto. Sin embargo, su destino toma un giro inesperado al ser uno de los 300 jóvenes delanteros sub-18 seleccionados por Jinpachi Ego. Este enigmático reclutador, contratado por la Asociación de Fútbol de Japón tras la Copa Mundial de la FIFA 2018, tiene la misión de reinventar el fútbol nipón y llevar a Japón a conquistar la Copa del Mundo. Para lograrlo, Ego aísla a estos talentos en la institución de Blue Lock, un ambiente similar a una prisión, donde cada participante deberá superar sus límites y forjar el ego más potente jamás visto en el deporte. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 368 chapters |  |  |  |
| chapter dates | PASS | 368 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 79 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | latest: `https://mangalect.org/.../latest_chapters_with_dates` to `https://mangalect.org/.../latest_chapters_with_dates` (1 redirects); search: `https://mangalect.org/.../buscar_mangas <redacted query values: page, page_size, and query>` to `https://mangalect.org/.../buscar_mangas <redacted query values: page, page_size, and query>` (1 redirects); pages: `https://mangalect.org/.../1.00` to `https://mangalect.org/.../1` (1 redirects) |  |  |  |
| page load | PASS | `https://images.mangalect.org/.../pagina_001.webp` (image/webp (encoding: lossy), 404186 bytes, 1244x1920) |  |  |  |
