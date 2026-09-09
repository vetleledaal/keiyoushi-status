# Extension Validation Report

- Extension: tachiyomi-pt.nocturnesummer-v1.4.54
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 5501311187877950699
- Source name: Nocturne Summer
- Source language: pt-BR
- Selected manga input: popular offset 0: Casei com meu sogro?! (`.../casei-com-meu-sogro`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 17 | Casei com meu sogro?! (`.../casei-com-meu-sogro`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 17 | Dearest (`.../dearest`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 8 | Posso Avaliar Seu Corpo, Também? (`.../posso-avaliar-seu-corpo-tambem`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 14 | Rix Vanus (`.../rixvanus`) |  | 10s+ |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Casei com meu sogro?! (`.../casei-com-meu-sogro`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Casei com meu sogro?! (`.../casei-com-meu-sogro`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 195 | Capítulo 00 (`https://nocfsb.com/.../capitulo-00 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Casei com meu sogro?!, URL=`.../casei-com-meu-sogro` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nocfsb.com/.../0.webp` (image/webp (encoding: lossy), 221780 bytes, 1280x1810) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../casei-com-meu-sogro` |  |  |  |
| details thumbnail URL | PASS | `https://nocfsb.com/.../0.webp` |  |  |  |
| details author | PASS | Plumage |  |  |  |
| details artist | PASS | Plumage |  |  |  |
| details genres | PASS | Comédia, Cotidiano, Fantasia, Romance, Yaoi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | No dia do casamento entre o dentista Zhen Hao e a médica Xiao Fu, um raio misterioso cai em cima do casal, e do pai da noiva Shen Ba Tian que está próximo ao casal. Logo após o estrondo, a médica Xiao Fu repentinamente trocou de corpo com seu próprio pai! A partir desse momento, a esposa do dentista é oficialmente seu sogro! No começo, tinha tudo para Zhen Hao odiar aquilo, afinal, a relação com seu sogro não era nada boa, mas por amor a sua noiva, ele aceitou ficar com a mesma apesar das trocas em momentos inoportunos. Quem diria que, conforme o tempo passava, Zhen Hao passasse a gostar mais ainda da presença do homem ranzinza que odiava, querendo se aproximar cada vez mais, tornando-se inesperadamente apaixonado pelo seu sogro.<br><br>Nomes alternativos: MY FATHER-IN-LAW IS MY WIFE, 岳父大人与甄好 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 195 chapters |  |  |  |
| chapter dates | PASS | 195 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 195 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://nocfsb.com/.../caseicom00_1.webp` (image/webp (encoding: lossy), 57558 bytes, 972x1873) |  |  |  |
