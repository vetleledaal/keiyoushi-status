# Extension Validation Report

- Extension: tachiyomi-es.houseofotakus-v1.6.59
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 1968531533450563052
- Source name: House Of Otakus
- Source language: es
- Selected manga input: popular offset 0: Soy el único con una desafortunada habilidad en otro mundo que Invoca a la Rebelión ~ Hasta que la habilidad más débil [Absorción] se lo trague todo ~ (`.../1943`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Soy el único con una desafortunada habilidad en otro mundo que Invoca a la Rebelión ~ Hasta que la habilidad más débil [Absorción] se lo trague todo ~ (`.../1943`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 8 | Armadura Estelar: Apocalipsis de Bestias, Sobrevivo Gracias a las Provisiones de mi Bisabuelo (`.../2726`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Intercambio de amantes (`.../2401`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 8 | Tú todavía no te abalanzarás sobre mí (`.../2267`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Soy el único con una desafortunada habilidad en otro mundo que Invoca a la Rebelión ~ Hasta que la habilidad más débil [Absorción] se lo trague todo ~ (`.../1943`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Soy el único con una desafortunada habilidad en otro mundo que Invoca a la Rebelión ~ Hasta que la habilidad más débil [Absorción] se lo trague todo ~ (`.../1943`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 165 | Capítulo 01 (`.../capitulo-01`) |  | 1-10s |
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
| manga title and URL | PASS | 67/67 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 67/67 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.houseofotakusv2.xyz/.../1GQVM2AALcW4.jpg` (image/jpeg, 2754914 bytes, 1792x2400) |  |  |  |
| details identity | PASS | Details preserved selected URL `1943` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.houseofotakusv2.xyz/.../1GQVM2AALcW4.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Fantasy, Isekai, Manga, Seinen, Sin Imaginización Scan |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Está es la historia de Nakatani Yuuto quien tenía una vida normal, hasta que toda su clase fue transferida a otro mundo. Todos los estudiantes obtuvieron habilidades poderosas y son adorados como héroes, pero Yuuto, es despreciado por tener una habilidad «basura», ¿Qué aventuras le esperan al «héroe inútil»? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 165 chapters |  |  |  |
| chapter dates | LINT | 117 of 165 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=117 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.houseofotakusv2.xyz/.../000.webp` (image/webp (encoding: lossy), 164076 bytes, 1280x1280) |  |  |  |
