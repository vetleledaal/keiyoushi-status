# Extension Validation Report

- Extension: tachiyomi-es.codearc-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5491278213927672737
- Source name: Code Arc Mangas
- Source language: es
- Selected manga input: latest offset 0: Erogaki to Kasshoku Seidorei - Mocoso pervertido y esclava sexual de piel oscura (`.../erogaki-to-kasshoku-seidorei-mocoso-pervertido-y-esclava-sexual-de-piel-oscura`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | TRIBU FUTANARI (`.../tribu-futanari`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | Vive A Lo Loco Y Todo Irá Bien (`.../vive-a-lo-loco-y-todo-ira-bien`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 15 | Erogaki to Kasshoku Seidorei - Mocoso pervertido y esclava sexual de piel oscura (`.../erogaki-to-kasshoku-seidorei-mocoso-pervertido-y-esclava-sexual-de-piel-oscura`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Oneshota Shinrei Spot Zenpen + Kouhen (`.../oneshota-shinrei-spot-zenpen-kouhen`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Erogaki to Kasshoku Seidorei - Mocoso pervertido y esclava sexual de piel oscura (`.../erogaki-to-kasshoku-seidorei-mocoso-pervertido-y-esclava-sexual-de-piel-oscura`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Erogaki to Kasshoku Seidorei - Mocoso pervertido y esclava sexual de piel oscura (`.../erogaki-to-kasshoku-seidorei-mocoso-pervertido-y-esclava-sexual-de-piel-oscura`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo 1 (`.../cascade`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.IllegalStateException: Settings can only be passed to CEF before createClient is called the first time. Current state is TERMINATED | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.IllegalStateException: Settings can only be passed to CEF before createClient is called the first time. Current state is TERMINATED | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Erogaki to Kasshoku Seidorei - Mocoso pervertido y esclava sexual de piel oscura, URL=`.../erogaki-to-kasshoku-seidorei-mocoso-pervertido-y-esclava-sexual-de-piel-oscura` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.codearctraducciones.com/.../cc60af6677.w320.webp` (image/webp (encoding: lossy), 28084 bytes, 320x512) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../erogaki-to-kasshoku-seidorei-mocoso-pervertido-y-esclava-sexual-de-piel-oscura` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn.codearctraducciones.com/.../cc60af6677.webp` (image/webp (encoding: lossy), 144898 bytes, 1000x1600) |  |  |  |
| details author | PASS | Yamadare |  |  |  |
| details artist | PASS | Yamadare |  |  |  |
| details genres | PASS | Piel Oscura, Pechos grandes, Culo grande, Bronceada, Súcubo, Harem, Chicas monstruo, Creampie, Blowjob, Chica alta, Shota, Aréolas grandes, Vellos |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Sin sipnosis disponible. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Settings can only be passed to CEF before createClient is called the first time. Current state is TERMINATED |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
