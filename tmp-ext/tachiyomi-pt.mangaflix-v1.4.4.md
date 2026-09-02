# Extension Validation Report

- Extension: tachiyomi-pt.mangaflix-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6813136769153267900
- Source name: MangaFlix
- Source language: pt-BR
- Selected manga input: latest offset 0: I Adopted a Villainous Dad (`.../68898ba23aadd2f9c93a5cff`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Martial Peak (`.../6513a5c4d0e2acdd1e1ab741`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 100 | I Adopted a Villainous Dad (`.../68898ba23aadd2f9c93a5cff`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 30 | I Adopted a Villainous Dad (`.../68898ba23aadd2f9c93a5cff`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | I Adopted a Villainous Dad (`.../68898ba23aadd2f9c93a5cff`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 93 | Capítulo 1 (`.../688a4f6c8b2cfc9c8be40bcf`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Adopted a Villainous Dad, URL=`.../68898ba23aadd2f9c93a5cff` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 160/160 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 160/160 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.mangaflix.net/.../09e646c5-e36b-47d0-9537-e94f5bd13e91.jpg` (image/webp (encoding: lossy), 663864 bytes, 1810x2560; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../68898ba23aadd2f9c93a5cff` |  |  |  |
| details thumbnail URL | PASS | `https://static.mangaflix.net/.../09e646c5-e36b-47d0-9537-e94f5bd13e91.jpg` |  |  |  |
| details author | PASS | AtlasScan |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasia, Romance, Shoujo |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Um dia eu acordei e eu tinha seis anos de idade. Eu havia transmigrado para dentro da personagem principal de um romance trágico, a Santa Priscilla, que atravessa todos os tipos de caminhos espinhosos! Já que estou aqui, eu preciso evitar o desastre especial agendado e viver feliz com meu personagem favorito, o chefão final da história e vilão, Melchizedek, o tirano do Império Rehel, que não tem sentimentos! Uma vida feliz ao adotar meu pai e me tornar princesa, com meu personagem favorito. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 93 chapters |  |  |  |
| chapter dates | LINT | 12 of 93 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=12 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://static.mangaflix.net/.../1.jpg` (image/webp (encoding: lossy), 64850 bytes, 747x540; server Content-Type: image/jpeg) |  |  |  |
