# Extension Validation Report

- Extension: tachiyomi-es.mhscans-v1.6.69
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3253304651550496369
- Source name: MHScans
- Source language: es
- Selected manga input: popular offset 0: El Antiguo Soberano de la Eternidad (`.../2429`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | El Antiguo Soberano de la Eternidad (`.../2429`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | De Un Simple Plebeyo A Duque En Otro Mundo (`.../136206770`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Era Sobrehumana (`.../136239628`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Artes Liberales X Ciencias (`.../136239616`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | El Antiguo Soberano de la Eternidad (`.../2429`) |  | 10s+ |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | El Antiguo Soberano de la Eternidad (`.../2429`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 598 | Capitulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 10s+ |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El Antiguo Soberano de la Eternidad, URL=`2429` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mhscans.com/.../inWLDZDxlUpRGBnoise_scaleLevel3x1.000000_waifu2x_art_noise3_scale-350x476.jpg` (image/jpeg, 72440 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `2429` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mhscans.com/.../inWLDZDxlUpRGBnoise_scaleLevel3x1.000000_waifu2x_art_noise3_scale.jpg` (image/jpeg, 1720423 bytes, 1215x1611) |  |  |  |
| details author | PASS | Tai Yi Shui Sheng |  |  |  |
| details artist | PASS | Jack Norway |  |  |  |
| details genres | PASS | Acción, Artes Marciales, Aventura, Ciencia ficción, Fantasía, Meian, Murim, Recomendado, Reencarnación, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Gu Feiyan, el tercer soberano muere y es reencarnado en un niño llamado Li Yunxia, una completa basura que todavia no desperto sus meridianos a pesar de su edad. ¡Pero esto no detendra al mc de alcanzar el pinaculo de este mundo otra vez!<br><br>Nombres Alternativos: Eternal Deity \| The Ancient Sovereign of Eternity \| The Ancient One \| The Ultimate of All Ages \| The Eternal Supreme \| |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 598 chapters |  |  |  |
| chapter dates | LINT | 76 of 598 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=76 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mhscans.com/.../01-01.webp` (image/webp (encoding: lossy), 512902 bytes, 640x4843) |  |  |  |
