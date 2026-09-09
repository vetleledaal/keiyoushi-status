# Extension Validation Report

- Extension: tachiyomi-pt.mrtenzus-v1.6.55
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
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
- Source ID: 4272456161813617008
- Source name: MR Tenzus
- Source language: pt-BR
- Selected manga input: latest offset 0: Desire Me If You Can (`.../6512`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Meu Namorado Perfeito (`.../436`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Você me faz sentir vergonha (`.../608`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Desire Me If You Can (`.../6512`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Esse alfa é demais (`.../6299`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Desire Me If You Can (`.../6512`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Desire Me If You Can (`.../6512`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 25 | Capítulo 01 (`.../capitulo-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 42 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Desire Me If You Can, URL=`6512` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mrtenzus.com/.../Desire-Me-if-you-Can-350x476.webp` (image/webp (encoding: lossy), 43858 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `6512` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mrtenzus.com/.../Desire-Me-if-you-Can.webp` (image/webp (encoding: lossy), 277576 bytes, 960x1358) |  |  |  |
| details author | PASS | ZIG |  |  |  |
| details artist | PASS | YP |  |  |  |
| details genres | PASS | Adulto, Comédia, Omegaverse, Romance, Yaoi |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | SINOPSE:<br><br>Grayson Miller é um Alpha Dominante cujo objetivo de vida é encontrar seu parceiro predestinado.<br><br>Ele recebe uma profecia de um xamã de que seu destino está ligado a alguém relacionado ao “fogo” que possui um “peito grande”.<br><br>Um dia, na cena de um incêndio, Grayson perde a consciência por causa dos feromônios de um bombeiro Ômega Dominante.<br><br>Assim que abre os olhos, fica convencido de que esse é o parceiro predestinado que ele vem procurando.<br><br>Ele consegue um emprego no corpo de bombeiros para encontrá-lo, mas, desde o primeiro dia, acaba se envolvendo em uma briga tremenda e se enreda profundamente com um colega bombeiro chamado Dane…<br><br>Nomes alternativos: Desire Me If You Can <redacted URL #1: resource; malformed; relative; no scheme> Deseje-me se Puder <redacted URL #1: resource; malformed; relative; no scheme> 디자이어 미 이프 유 캔 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 25 chapters |  |  |  |
| chapter dates | PASS | 25 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mrtenzus.com/.../AVISO.png` (image/png, 2176999 bytes, 1536x1024) |  |  |  |
