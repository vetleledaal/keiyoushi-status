# Extension Validation Report

- Extension: tachiyomi-pt.cafecomyaoi-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 340055543197648554
- Source name: Café com Yaoi
- Source language: pt-BR
- Selected manga input: popular offset 0: Ang Ang (`.../344`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Ang Ang (`.../344`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Rouxinol, Aguardando a Primavera (`.../1274`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Amado Desde os Pés (`.../1346`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Relação sem Ajuda (`.../350`) |  | 10s+ |
| search | `getSearchManga(1, query, getFilterList())` | success | 25 | Ang Ang (`.../344`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ang Ang (`.../344`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 39 | Capítulo 01 (`.../capitulo-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ang Ang, URL=`344` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 125/125 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 125/125 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cafecomyaoi.com.br/.../Yt-N6044RGdiO4Qb2qJ4wpGsv3QSuG_p3Xr0-6EsznGJidpmDYjQsleSE74d7RCcqZ7KrmWTJRlTEMqsKexrCg-175x238.webp` (image/webp (encoding: lossy), 10208 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `344` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cafecomyaoi.com.br/.../Yt-N6044RGdiO4Qb2qJ4wpGsv3QSuG_p3Xr0-6EsznGJidpmDYjQsleSE74d7RCcqZ7KrmWTJRlTEMqsKexrCg-193x278.webp` (image/webp (encoding: lossy), 12416 bytes, 193x278) |  |  |  |
| details author | PASS | Gwendolyn |  |  |  |
| details artist | PASS | Huingin |  |  |  |
| details genres | PASS | Adulto, BDSM, BL, Mature, Romance, Smut, 5, Cancelado, Manhwa |  |  |  |
| details status | PASS | CANCELLED (5) |  |  |  |
| details description | PASS | Nível de Quentura: ☕☕☕☕☕<br><br>Quando o ex-mercenário Gyuwon Kim retorna à Coréia após sua aposentadoria, ele tem apenas um objetivo em mente: ganhar dinheiro suficiente para fazer uma cirurgia plástica. Embora ter um rosto capaz de fazer até um homem adulto chorar de medo tenha sido útil como mercenário, o que Gyuwon realmente quer é ser aquele que chora nas mãos de um mestre implacável. A oportunidade perfeita surge quando Gyuwon é contratado como guarda-costas para proteger o precioso filho mais novo do Clã Yoon, Hwayoung Yoon, de um perseguidor recente. Sem o conhecimento de Gyuwon, escondido atrás do rosto bonito de Hwayoung é na verdade um dom sádico que já tem planos de fazer do homem de aparência viciosa seu novo animal de estimação.<br><br>PARCERIA CANCELADA. VOCÊ PODERÁ LER A OBRA NA AMUY SCAN.<br><br>Nomes alternativos: 앙앙; Hard-Boiled Love; anan |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 39 chapters |  |  |  |
| chapter dates | PASS | 39 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cafecomyaoi.com.br/.../00capa_angang_01.png` (image/png, 367880 bytes, 700x397) |  |  |  |
