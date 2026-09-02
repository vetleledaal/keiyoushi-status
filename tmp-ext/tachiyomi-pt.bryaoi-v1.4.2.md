# Extension Validation Report

- Extension: tachiyomi-pt.bryaoi-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 27
- Lint: 3
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3480299458405323329
- Source name: BR Yaoi
- Source language: pt-BR
- Selected manga input: popular offset 0: Pearl Boy: Ignite the Dawn (`.../pearl-boy-ignite-the-dawn-online`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Pearl Boy: Ignite the Dawn (`.../pearl-boy-ignite-the-dawn-online`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 18 | Passion: Raga (Novel) (`.../passion-raga-novel-online`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Pearl Boy: Ignite the Dawn (`.../pearl-boy-ignite-the-dawn-online`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Pearl Boy: Ignite the Dawn (`.../pearl-boy-ignite-the-dawn-online`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 52 | Capítulo 01 (`.../pearl-boy-ignite-the-dawn-01-online`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 13 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Pearl Boy: Ignite the Dawn, URL=`.../pearl-boy-ignite-the-dawn-online` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nameclubpower.xyz/.../pearl-boy-ignite-the-dawn.webp` (image/webp (encoding: lossy), 89302 bytes, 735x979) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../pearl-boy-ignite-the-dawn-online` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://nameclubpower.xyz/.../pearl-boy-ignite-the-dawn_178.webp` (image/webp (encoding: lossy), 11516 bytes, 247x330) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adulto, Drama, Mangás, Manhwa, Psicológico, Yaois |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | <br>Feito com tradução não oficial!!! Baek Seunghyun passou toda a sua vida como o braço direito de Shin Jaeil, um chefe da yakuza. O homem que ele via como uma figura paterna finalmente se casa, e Seunghyun se vê em uma fase de rebeldia tardia. Deixando o casamento barulhento para trás, ele vaga pelas ruas sozinho quando, inesperadamente, encontra Yuta, alguém com quem teve uma conexão há dez anos no Japão. A linda e gentil Yuta. Seunghyun imaginou que poderia afogar suas frustrações com esse pirralho insignificante em um drinque, mas a expressão de Yuta escurece em um instante, vomitando apenas besteiras irritantes. Nome alternativo: Pearl Boy Ignite The Dawn<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 52 chapters |  |  |  |
| chapter dates | LINT | All 52 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=52 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://nameclubpower.xyz/.../1.webp` (image/webp (encoding: lossy), 76830 bytes, 1241x925) |  |  |  |
