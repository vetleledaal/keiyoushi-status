# Extension Validation Report

- Extension: tachiyomi-es.houseofotakus-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1968531533450563052
- Source name: House Of Otakus
- Source language: es
- Selected manga input: popular offset 0: Soy el único con una desafortunada habilidad en otro mundo que Invoca a la Rebelión ~ Hasta que la habilidad más débil [Absorción] se lo trague todo ~ (`.../1943`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Soy el único con una desafortunada habilidad en otro mundo que Invoca a la Rebelión ~ Hasta que la habilidad más débil [Absorción] se lo trague todo ~ (`.../1943`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 4 | No es amor todavía, pero… (`.../2270`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Una vida de aventurero en la segunda vuelta después de derrotar al jefe final (`.../1922`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 4 | En el Décimo Año, el Transferido que Renunció a Regresar Finalmente se convierte en el Protagonista (`.../1905`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Soy el único con una desafortunada habilidad en otro mundo que Invoca a la Rebelión ~ Hasta que la habilidad más débil [Absorción] se lo trague todo ~ (`.../1943`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Soy el único con una desafortunada habilidad en otro mundo que Invoca a la Rebelión ~ Hasta que la habilidad más débil [Absorción] se lo trague todo ~ (`.../1943`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 163 | Capítulo 01 (`.../capitulo-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Soy el único con una desafortunada habilidad en otro mundo que Invoca a la Rebelión ~ Hasta que la habilidad más débil \[Absorción\] se lo trague todo ~, URL=`1943` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://houseofotakusv2.xyz/.../cca163b5-f69b-4d8a-83ae-b6a691d0f1b5-175x238.jpg` (image/jpeg, 14683 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `1943` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://houseofotakusv2.xyz/.../cca163b5-f69b-4d8a-83ae-b6a691d0f1b5-193x278.jpg` (image/jpeg, 18424 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Fantasy, Isekai, Manga, Seinen, Sin Imaginización Scan |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Está es la historia de Nakatani Yuuto quien tenía una vida normal, hasta que toda su clase fue transferida a otro mundo. Todos los estudiantes obtuvieron habilidades poderosas y son adorados como héroes, pero Yuuto, es despreciado por tener una habilidad «basura», ¿Qué aventuras le esperan al «héroe inútil»? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 163 chapters |  |  |  |
| chapter dates | LINT | 114 of 163 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=114 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://houseofotakusv2.xyz/.../000.webp` (image/webp (encoding: lossy), 164076 bytes, 1280x1280) |  |  |  |
