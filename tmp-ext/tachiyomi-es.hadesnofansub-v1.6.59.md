# Extension Validation Report

- Extension: tachiyomi-es.hadesnofansub-v1.6.59
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8311505150576608267
- Source name: Hades no Fansub
- Source language: es
- Selected manga input: popular offset 0: El Antiguo Soberano (`.../2796`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | El Antiguo Soberano (`.../2796`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Chronicles of a Returner (`.../2750`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | La regresión del funcionario de gobierno más fuerte (`.../2361`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Querido Amigo (`.../2760`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | El Antiguo Soberano (`.../2796`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | El Antiguo Soberano (`.../2796`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 528 | Capítulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 15 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El Antiguo Soberano, URL=`2796` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lectorhades.latamtoon.com/.../portada-26-350x476.jpg` (image/jpeg, 71573 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `2796` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://lectorhades.latamtoon.com/.../portada-26-193x278.jpg` (image/jpeg, 35638 bytes, 193x278) |  |  |  |
| details author | PASS | Tai Yi Shui Sheng |  |  |  |
| details artist | PASS | Jack Norway |  |  |  |
| details genres | PASS | Acción, Artes Marciales, MANHUA |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Gu Feiyan, el tercer soberano muere y es reencarnado en un niño llamado Li Yunxiao, una completa basura que todavía no ha despertado sus meridianos a pesar de su edad. ¡Pero esto no detendrá al mc de alcanzar el pináculo de este mundo otra vez!<br><br><br><br><br><br>Nombres Alternativos: Eternal Deity \| The Ancient Sovereign of Eternity \| 万古至尊 \| The Ancient One \| The Ultimate of All Ages \| The Eternal Supreme \| 這一世我要當至尊 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 528 chapters |  |  |  |
| chapter dates | LINT | All 528 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=528 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://lectorhades.latamtoon.com/.../1.webp` (image/webp (encoding: lossy), 117082 bytes, 640x965) |  |  |  |
