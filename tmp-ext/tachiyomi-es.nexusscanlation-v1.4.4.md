# Extension Validation Report

- Extension: tachiyomi-es.nexusscanlation-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4086183896761281232
- Source name: NexusScanlation
- Source language: es
- Selected manga input: latest offset 0: Gatita traviesa (`.../gatita-traviesa`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Conquista hipnotica (`.../conquista-hipnotica`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Estoy abandonando los cómics eróticos (`.../estoy-abandonando-los-comics-eroticos-2`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 20 | Gatita traviesa (`.../gatita-traviesa`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Diario de una Esclava (`.../diario-de-una-esclava`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Gatita traviesa (`.../gatita-traviesa`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Gatita traviesa (`.../gatita-traviesa`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 21 | Capítulo 1 (`.../capitulo-1`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Gatita traviesa, URL=`gatita-traviesa` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.nexusscanlation.com/.../portada.jpg` (image/jpeg, 47173 bytes, 460x644) |  |  |  |
| details identity | PASS | Details preserved selected URL `gatita-traviesa` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.nexusscanlation.com/.../portada.jpg` |  |  |  |
| details author | PASS | Gomudong Ryeokgi |  |  |  |
| details artist | PASS | Goguma |  |  |  |
| details genres | PASS | Comedia, Drama, Ecchi, Harem, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Hay dos tipos de personas: El que elige y el que es elegido. Si hay un protagonista, tiene que haber personajes secundarios, y un protagonista solo es digno de otro protagonista. Pero la mayoría de la gente no sabe a qué tipo pertenece. "¿Solo porque me porto bien, crees que soy fácil de atrapar?" |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 21 chapters |  |  |  |
| chapter dates | PASS | 21 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.nexusscanlation.com/.../001.jpg` (image/png, 392180 bytes, 798x512; server Content-Type: image/jpeg) |  |  |  |
