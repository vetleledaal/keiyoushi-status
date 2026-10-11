# Extension Validation Report

- Extension: tachiyomi-pt.pointzerotoons-v1.6.3
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
- Source ID: 2210021497257492329
- Source name: Point Zero Toons
- Source language: pt-BR
- Selected manga input: popular offset 0: O Cultivador Imortal da Cidade Renascido (`.../o-cultivador-imortal-da-cidade-renascido`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | O Cultivador Imortal da Cidade Renascido (`.../o-cultivador-imortal-da-cidade-renascido`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Gaste Mais, Ganhe Mais! (`.../gaste-mais-ganhe-mais`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Demônio Celestial Quer Viver em Paz (`.../demonio-celestial-quer-viver-em-paz`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | A Superação do Nobre Vagabundo (`.../a-superacao-do-nobre-vagabundo`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | O Cultivador Imortal da Cidade Renascido (`.../o-cultivador-imortal-da-cidade-renascido`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | O Cultivador Imortal da Cidade Renascido (`.../o-cultivador-imortal-da-cidade-renascido`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1077 | Capítulo 01 (`.../o-cultivador-imortal-da-cidade-renascido-capitulo-01`) |  | <1s |
| pages | `getPageList(chapter)` | success | 24 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=O Cultivador Imortal da Cidade Renascido, URL=`.../o-cultivador-imortal-da-cidade-renascido` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Gaste Mais, Ganhe Mais!, URL=`.../gaste-mais-ganhe-mais` at page 1 offset 23 and page 2 offset 0 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kitsuneyako.com/.../cid.jpg` (image/jpeg, 182609 bytes, 741x1024) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../o-cultivador-imortal-da-cidade-renascido` |  |  |  |
| details thumbnail URL | PASS | `https://kitsuneyako.com/.../cid.jpg` |  |  |  |
| details author | PASS | Shili Jianshen |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Chen Fanyu morreu durante a Grande Tribulação Divina, alcançando o auge do cultivo em menos de 500 anos. Milagrosamente, mesmo perdendo seus fundamentos, ele retornou à sua juventude como um estudante universitário na Terra. Determinado a trilhar novamente o caminho para a imortalidade, armado com o conhecimento de sua vida passada, ele busca corrigir seus erros, superar seus arrependimentos e estabelecer uma base espiritual sólida que lhe garanta sucesso em sua inevitável ascensão a outro plano de existência. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1077 chapters |  |  |  |
| chapter dates | LINT | All 1077 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1077 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.kitsuneyako.com/.../001.webp` (image/webp (encoding: lossy), 289704 bytes, 1200x2998) |  |  |  |
