# Extension Validation Report

- Extension: tachiyomi-es.mhscans-v1.4.66
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3253304651550496369
- Source name: MHScans
- Source language: es
- Selected manga input: popular offset 0: El Antiguo Soberano de la Eternidad (`.../el-antiguo-soberano-de-la-eternidad`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | El Antiguo Soberano de la Eternidad (`.../el-antiguo-soberano-de-la-eternidad`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | Maestro Dragón: ¡¿ La Profesión más «Inútil»?! (`.../maestro-dragon-la-profesion-mas-inutil`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 12 | Maestro Dragón: ¡¿ La Profesión más «Inútil»?! (`.../maestro-dragon-la-profesion-mas-inutil`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | De Un Simple Plebeyo A Duque En Otro Mundo (`.../voy-a-pedir-la-renuncia-con-vacaciones-pagadas`) |  | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | El Antiguo Soberano de la Eternidad (`.../el-antiguo-soberano-de-la-eternidad`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | El Antiguo Soberano de la Eternidad (`.../el-antiguo-soberano-de-la-eternidad`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 586 | Capitulo 1 (`https://mhscans.com/.../capitulo-1 <redacted query values: style>`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | 10s+ |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El Antiguo Soberano de la Eternidad, URL=`.../el-antiguo-soberano-de-la-eternidad` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mhscans.com/.../inWLDZDxlUpRGBnoise_scaleLevel3x1.000000_waifu2x_art_noise3_scale-350x476.jpg` (image/jpeg, 72440 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../el-antiguo-soberano-de-la-eternidad` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mhscans.com/.../inWLDZDxlUpRGBnoise_scaleLevel3x1.000000_waifu2x_art_noise3_scale.jpg` (image/jpeg, 1720423 bytes, 1215x1611) |  |  |  |
| details author | PASS | Tai Yi Shui Sheng |  |  |  |
| details artist | PASS | Jack Norway |  |  |  |
| details genres | PASS | Acción, Artes Marciales, Aventura, Ciencia ficción, Fantasía, Meian, Murim, Recomendado, Reencarnación, Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Gu Feiyan, el tercer soberano muere y es reencarnado en un niño llamado Li Yunxia, una completa basura que todavia no desperto sus meridianos a pesar de su edad. ¡Pero esto no detendra al mc de alcanzar el pinaculo de este mundo otra vez!<br><br>Nombres Alternativos: Eternal Deity \| The Ancient Sovereign of Eternity \| The Ancient One \| The Ultimate of All Ages \| The Eternal Supreme \| |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 586 chapters |  |  |  |
| chapter dates | PASS | 586 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 586 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mhscans.com/.../01-01.webp` (image/webp (encoding: lossy), 512902 bytes, 640x4843) |  |  |  |
